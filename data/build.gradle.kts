plugins {
	id("java-library")
	id("org.jetbrains.kotlin.jvm")
	id("kotlin")
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
	implementation(project(":domain"))
}