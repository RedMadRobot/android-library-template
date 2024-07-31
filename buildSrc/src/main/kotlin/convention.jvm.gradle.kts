import com.redmadrobot.build.dsl.isRunningOnCi
import org.jetbrains.kotlin.gradle.dsl.kotlinExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

kotlinExtension.jvmToolchain(17)

// Treat all warnings as errors on CI
val warningsAsErrors = findProperty("warningsAsErrors") == "true" || isRunningOnCi

tasks.withType<KotlinJvmCompile>().configureEach {
    compilerOptions {
        allWarningsAsErrors = warningsAsErrors
        // Keep the library compatible with old versions of Java.
        freeCompilerArgs.add("-Xjdk-release=11")
    }
}
