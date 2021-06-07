object Versions {
    const val compose = "1.0.0-beta08"
    const val composeActivity = "1.3.0-alpha03"
    const val composeNavigation = "2.4.0-alpha02"
    const val koinStable = "3.0.2"
    const val koinUnstable = "3.0.1"
    const val material = "1.3.0"
    const val appCompat = "1.3.0"
}

object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = 30
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val animation = "androidx.compose.animation:animation:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val compiler = "androidx.compose.compiler:compiler:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"

    const val navigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
    const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
}

object Koin {
    val core = "io.insert-koin:koin-core:${Versions.koinStable}"
    val test = "io.insert-koin:koin-test:${Versions.koinStable}"
    val android = "io.insert-koin:koin-android:${Versions.koinStable}"
    val compose = "io.insert-koin:koin-androidx-compose:${Versions.koinUnstable}"
}

object Android {
    val material = "com.google.android.material:material:${Versions.material}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
}