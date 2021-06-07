plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = AndroidSdk.compile
    defaultConfig {
        applicationId = "com.marinj.shoppingwarfare.android"
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
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
        kotlinCompilerExtensionVersion = "1.0.0-beta08"
    }
}

dependencies {
    implementation(project(":shared"))

    implementation(Compose.ui)
    implementation(Compose.runtime)
    implementation(Compose.animation)
    implementation(Compose.uiGraphics)
    implementation(Compose.foundation)
    implementation(Compose.uiTooling)
    implementation(Compose.foundationLayout)
    implementation(Compose.material)
    implementation(Compose.compiler)
    implementation(Compose.navigation)

    implementation(Android.material)
    implementation(Android.appCompat)

    implementation(Koin.android)
    implementation(Koin.compose)
    implementation(Koin.core)

    testImplementation(Koin.test)
}