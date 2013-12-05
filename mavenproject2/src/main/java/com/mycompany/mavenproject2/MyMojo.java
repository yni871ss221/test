package com.mycompany.mavenproject2;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Mojo(
        name = "yanai",
        defaultPhase = LifecyclePhase.PROCESS_SOURCES,
        threadSafe = true
)
public class MyMojo extends AbstractMojo {
    @Parameter( defaultValue = "${project.build.directory}", property = "outputDir", required = true )
    private File outputDirectory;

    public void execute() throws MojoExecutionException {
        getLog().info( "Test aaaaaaaaaaaaaaaaa");
        getLog().debug("Test bbbbbbbbbbbbbbbbb");
        getLog().error("Test ccccccccccccccccc");
    }
}
