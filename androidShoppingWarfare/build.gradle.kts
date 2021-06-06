plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.marinj.shoppingwarfare.android"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerVersion = "1.5.10"
        kotlinCompilerExtensionVersion = "1.0.0-beta08"
    }
}

dependencies {
    val composeVersion = "1.0.0-beta08"
    val runtime = "androidx.compose.runtime:runtime:${composeVersion}"
    val ui = "androidx.compose.ui:ui:${composeVersion}"
    val animation = "androidx.compose.animation:animation:$composeVersion}"
    val material = "androidx.compose.material:material:${composeVersion}"
    val uiTooling = "androidx.compose.ui:ui-tooling:${composeVersion}"
    val foundation = "androidx.compose.foundation:foundation:${composeVersion}"
    val foundationLayout = "androidx.compose.foundation:foundation-layout:${composeVersion}"
    val compiler = "androidx.compose.compiler:compiler:${composeVersion}"

    val composeActivitiesVersion = "1.3.0-alpha03"
    val activity = "androidx.activity:activity-compose:${composeActivitiesVersion}"

    val composeNavigationVerson = "1.0.0-alpha10"
    val navigation = "androidx.navigation:navigation-compose:${composeNavigationVerson}"

    implementation(project(":shared"))

    implementation(runtime)
    implementation(ui)
    implementation(animation)
    implementation(material)
    implementation(uiTooling)
    implementation(foundation)
    implementation(foundationLayout)
    implementation(activity)
    implementation("androidx.compose.compiler:compiler:1.0.0-beta08")
    implementation(navigation)

    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
}