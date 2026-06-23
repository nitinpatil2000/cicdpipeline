plugins {
    `kotlin-dsl`
}

group = "com.nitin.build_logic"

dependencies {
    implementation(libs.agp)
}

gradlePlugin {
    plugins {
        register("androidFlavors") {
            id = "com.nitin.flavors"
            implementationClass = "com.nitin.build_logic.FlavorsConventionPlugin"
        }
    }
}
