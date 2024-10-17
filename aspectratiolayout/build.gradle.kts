plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.takwolf.android.aspectratiolayout"
    compileSdk = 35

    defaultConfig {
        minSdk = 21

        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.8.2")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.takwolf.android.aspectratiolayout"
            artifactId = "aspectratiolayout"
            version = "0.0.1"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
