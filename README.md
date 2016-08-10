mvn archetype:generate -DarchetypeGroupId=org.apache.karaf.archetypes -DarchetypeArtifactId=karaf-bundle-archetype -DarchetypeVersion=4.0.5

mvn archetype:generate -DarchetypeGroupId=org.apache.karaf.archetypes -DarchetypeArtifactId=karaf-feature-archetype -DarchetypeVersion=4.0.5

Update xmlns to xmlns="http://karaf.apache.org/xmlns/features/v1.3.0" in feature.xml