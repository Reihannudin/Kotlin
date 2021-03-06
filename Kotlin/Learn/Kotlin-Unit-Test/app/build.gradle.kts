/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("Kotlin.Unit.Test.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))

//    Add Junit
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
//    Add Mockito JUnit
    testImplementation("org.mockito:mockito-junit-jupiter:4.4.0")

}

//tasks for custom JDK
tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class).all {
    kotlinOptions {
        jvmTarget = "16"
    }
}

// Task for Gradle compitable with Junit 5
tasks.named<Test>("test") {
    useJUnitPlatform{
        excludeTags("intergrations-sample-test")
    }
}

//make tasks for Simple Intergrations
tasks.register("intergrations-sample-test", Test::class) {
    useJUnitPlatform{
        includeTags("intergrations-sample-test")
    }
}


application {
    // Define the main class for the application.
    mainClass.set("Kotlin.Unit.Test.app.AppKt")
}







