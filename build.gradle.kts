
buildscript {
    repositories {
        mavenLocal()

        maven { setUrl("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven {
            setUrl("https://maven.aliyun.com/nexus/content/repositories/releases/")
            name = "aliyun"
        }
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("https://maven.aliyun.com/repository/jcenter") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }

        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/releases") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/snapshots") }
        maven { setUrl("https://developer.huawei.com/repo/") }

        google()
        mavenCentral()
        maven("https://www.jitpack.io")
        maven("https://maven.aliyun.com/repository/central")
    }
    dependencies {
        classpath(libs.groovy.json)
        classpath(libs.andserver)
        classpath(libs.okhttp)
    }
}
plugins{
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.compose) apply false
}

