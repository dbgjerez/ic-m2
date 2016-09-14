job('ic-w2-jacoco') {
    scm {
        git('git://github.com/dbgjerez/ic-m2.git')
    }
    triggers {
    	 upstream('ic-w2-clean', 'SUCCESS')
    }
    steps {
        gradle('jacocoTestReport')
    }
}
