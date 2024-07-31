import com.redmadrobot.build.dsl.*
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()

    pom {
        name.convention(project.name)
        description.convention(project.description)

        licenses {
            mit()
        }

        developers {
            // TODO: Specify real developer information
            // developer(id = "github_nickname", name = "Name Surname", email = "n.surname@redmadrobot.com")
        }

        setGitHubProject("RedMadRobot/%Stub%")
    }
}

publishing {
    repositories {
        if (isRunningOnCi) githubPackages("RedMadRobot/%Stub%")
    }
}
