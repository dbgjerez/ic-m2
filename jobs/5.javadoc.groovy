job('ic-w2-javadoc') {
    scm {
        git('git://github.com/dbgjerez/ic-m2.git')
    }
    triggers {
    	 upstream('ic-w2-sonar', 'SUCCESS')
    }
    steps {
        gradle('javadoc')
    }
}
