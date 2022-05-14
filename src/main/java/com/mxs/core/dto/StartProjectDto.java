package com.mxs.core.dto;

import java.util.List;

public class StartProjectDto {
    private String repositoryName;
    private String packageBase;
    private PackageProject packageProject;
    private List<DependencyProject> dependencyProjectList;

    public StartProjectDto() {}

    public String getRepositoryName() { return repositoryName; }
    public String getPackageBase() {
        return packageBase;
    }
    public PackageProject getPackageProject() {
        return packageProject;
    }
    public List<DependencyProject> getDependencyProjectList() { return dependencyProjectList; }
    public void setRepositoryName(String repositoryName) { this.repositoryName = repositoryName; }
    public void setPackageBase(String packageBase) {
        this.packageBase = packageBase;
    }
    public void setPackageProject(PackageProject packageProject) {
        this.packageProject = packageProject;
    }
    public void setDependencyProjectList(List<DependencyProject> dependencyProjectList) { this.dependencyProjectList = dependencyProjectList; }

    static class PackageProject {
        private String groupId;
        private String artifactId;
        private String version;
        private String name;
        private String description;

        public PackageProject() {}

        public String getGroupId() { return groupId; }
        public String getArtifactId() { return artifactId; }
        public String getVersion() { return version; }
        public String getName() { return name; }
        public String getDescription() { return description; }
        public void setGroupId(String groupId) { this.groupId = groupId; }
        public void setArtifactId(String artifactId) { this.artifactId = artifactId; }
        public void setVersion(String version) { this.version = version; }
        public void setName(String name) { this.name = name; }
        public void setDescription(String description) { this.description = description; }
    }

    static class DependencyProject {
        private String groupId;
        private String artifactId;
        private String version;
        private String scope;

        public DependencyProject() {}

        public String getGroupId() { return groupId; }
        public String getArtifactId() { return artifactId; }
        public String getVersion() { return version; }
        public String getScope() { return scope; }
        public void setGroupId(String groupId) { this.groupId = groupId; }
        public void setArtifactId(String artifactId) { this.artifactId = artifactId; }
        public void setVersion(String version) { this.version = version; }
        public void setScope(String scope) { this.scope = scope; }
    }
}
