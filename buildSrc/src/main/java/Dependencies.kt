object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = 30

}

object Versions {
    const val compose = "1.0.0-beta09"
    const val composeActivity = "1.3.0-beta01"
    const val composeNavigation = "2.4.0-alpha03"
    const val coroutines = "1.5.0"
    const val koinStable = "3.0.2"
    const val material = "1.3.0"
    const val appCompat = "1.3.0"
    const val kotlin = "1.5.10"
    const val sqlDelight = "1.5.0"
    const val ktlint = "0.40.0"
    const val hilt = "2.37"
    const val hiltNavigationCompose = "1.0.0-alpha02"
    const val jvmTarget = "1.8"
}

object Dependencies {
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val koinCore = "io.insert-koin:koin-core:${Versions.koinStable}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koinStable}"
    const val koinTest = "io.insert-koin:koin-test:${Versions.koinStable}"

    const val sqlDelightGradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
    const val sqlDelightRuntime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
    const val sqlDelightAndroidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
    const val sqlDelightNativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    const val sqlDelightCoroutinesExtension = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"

    const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val composeAnimation = "androidx.compose.animation:animation:${Versions.compose}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val composeCompiler = "androidx.compose.compiler:compiler:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val composeNavigation =
        "androidx.navigation:navigation-compose:${Versions.composeNavigation}"

    const val material = "com.google.android.material:material:${Versions.material}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
}