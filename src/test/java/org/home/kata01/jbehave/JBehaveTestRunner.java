package org.home.kata01.jbehave;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.junit.Test;

import java.util.List;

public class JBehaveTestRunner {
    @Test
    public void runClasspathLoadedStoriesAsJUnit() {
        Embedder embedder = new CheckOutEmbedder();
        List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromPath("src/test/resources"),
                                                              "**/*.story",
                                                              "**/exclude_*.story");
        embedder.runStoriesAsPaths(storyPaths);
    }
}