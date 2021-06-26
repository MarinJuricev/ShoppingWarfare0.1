import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

apply(plugin = "org.jmailen.kotlinter")

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("com.squareup.sqldelight")
}

version = "1.0"

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../iosShoppingWarfare/Podfile")
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Dependencies.sqlDelightRuntime)
                implementation(Dependencies.sqlDelightCoroutinesExtension)

                api(Dependencies.koinCore)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))

                implementation(Dependencies.turbine)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(Dependencies.sqlDelightAndroidDriver)

                api(Dependencies.koinAndroid)

            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")

                //TODO: There isn't any available mocking library for KMM, for now write all the unit tests in the Android
                implementation(Dependencies.mockk)
                implementation(Dependencies.coroutinesTest)
            }
        }
        val iosMain by getting {
            dependencies {
                implementation(Dependencies.sqlDelightNativeDriver)
            }
        }
        val iosTest by getting
    }
}

android {
    compileSdk = 30
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

sqldelight {
    database("ShoppingWarfareDatabase") {
        packageName = "com.marinj.shoppingwarfare.core.data.datasource"
        sourceFolders = listOf("sqldelight")
    }
}