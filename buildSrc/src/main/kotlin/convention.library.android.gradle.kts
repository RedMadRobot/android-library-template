plugins {
    kotlin("android")
    id("com.android.library")
    id("convention.jvm")
    id("convention.publishing")
    id("convention.detekt")
}

android {
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
}

kotlin {
    explicitApi()
}
