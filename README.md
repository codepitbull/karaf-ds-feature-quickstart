mvn archetype:generate -DarchetypeGroupId=org.apache.karaf.archetypes -DarchetypeArtifactId=karaf-bundle-archetype -DarchetypeVersion=4.0.5
mvn archetype:generate -DarchetypeGroupId=org.apache.karaf.archetypes -DarchetypeArtifactId=karaf-feature-archetype -DarchetypeVersion=4.0.5

feature:repo-add mvn:de.codepitbull.karaf/test-feature/1.0-SNAPSHOT/xml/features
feature:install test-feature