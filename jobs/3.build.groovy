job('ic-w2-build') {
    scm {
        git('git://github.com/dbgjerez/ic-m2.git')
    }
    triggers {
    	 upstream('ic-w2-jacoco', 'SUCCESS')
    }
    steps {
        gradle('build')
    }
}
