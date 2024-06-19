buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22") // Or your Kotlin version
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
//        classpath("androidx.room:room-runtime:2.5.2") // Room compiler
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}