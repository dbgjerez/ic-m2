job('ic-w2-clean') {
    scm {
        git('git://github.com/dbgjerez/ic-m2.git')
    }
    triggers {
    	githubPush()
	upstream('ic-w1-build', 'SUCCESS')
    }
    steps {
        gradle('clean')
    }
}
