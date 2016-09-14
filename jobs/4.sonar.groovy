job('ic-w2-sonar') {
    scm {
        git('git://github.com/dbgjerez/ic-m2.git')
    }
    triggers {
    	 upstream('ic-w2-build', 'SUCCESS')
    }
    steps {
        gradle('sonarqube')
    }
}
