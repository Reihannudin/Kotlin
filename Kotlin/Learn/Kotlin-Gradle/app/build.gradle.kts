/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("Kotlin.Gradle.kotlin-application-conventions")
}

//make repositories
repositories {
//    add repositories
//  jcenter( // jcenter repositories (depecarted)
    mavenCentral() // mavenCentral repositories
    google() // Google repositories
//    user provate repositories
    maven{
        url = uri("https://maven.aliyun.com/nexus/content/groups/public/")
    }
}


dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))

//    add dependencies : Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
//    add dependencies : Use the Kotlin JDK 8 standard library
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    add dependencies : Use the Ktlin test library
    testImplementation("org.jetbrains.kotlin:kotlin-test")
//    add dependencies : Use the Kotlin JUnit integration
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
//    add dependencies : Add Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
//    add dependencies : for manipulate data Json
    implementation("com.google.code.gson:gson:2.9.0")

////    add Sub-Projects
//    implementation(project(":belajar-grade-model"))
//    implementation(project(":belajar-gradle-util"))

}

application {
    // Define the main class for the application.
    mainClass.set("Kotlin.Gradle.app.AppKt")
}

//make Costume Task
tasks.register("sayHello"){
    doFirst{ // doFirst
        println("Hello Reihan!!")
    }
    doLast{ // doLast
        println("Hai Reihan!!")
    }
}

//make costume Task from file gradle properties
tasks.register("author"){
//    def variable author and email
    val author: String by project
    val email: String by project

    doLast{ // if only one you can just call doLast
        println("Author: ${author}, Email: ${email}")
    }
}


