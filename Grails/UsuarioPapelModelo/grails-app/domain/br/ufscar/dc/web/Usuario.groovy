package br.ufscar.dc.web

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String username
    String password
    String nome
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    String toString() {
        return nome
    }

    Set<Papel> getAuthorities() {
        (UsuarioPapel.findAllByUsuario(this) as List<UsuarioPapel>)*.papel as Set<Papel>
    }

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
    }

    static mapping = {
	    password column: '`password`'
    }
}
