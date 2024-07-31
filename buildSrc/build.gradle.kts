plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.infrastructure.publish)
    implementation(libs.infrastructure.android)
    implementation(libs.publish.gradlePlugin)
    implementation(libs.gradle.android.cacheFixGradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.detekt.gradlePlugin)
    implementation(libs.android.gradlePlugin)
}
