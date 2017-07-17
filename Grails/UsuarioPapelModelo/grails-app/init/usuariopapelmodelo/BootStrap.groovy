package usuariopapelmodelo

import br.ufscar.dc.web.Usuario
import br.ufscar.dc.web.Papel
import br.ufscar.dc.web.UsuarioPapel

class BootStrap {

    def init = { servletContext ->

        if (!Papel.list()) {
            new Papel(authority: "ROLE_ADMIN").save flush: true  /* Administrador */
            new Papel(authority: "ROLE_USER").save flush: true   /* Usuário */

            println "Populando papéis de usuário - OK"
        }

        if (!Usuario.list()) {
            def admin = new Usuario (
                    username: "admin",
                    password: "root",
                    nome: "Administrador",
                    enabled: true
            )
            admin.save flush: true

            UsuarioPapel.create admin, Papel.findByAuthority("ROLE_ADMIN"), true

            println "Populando usuario admin - OK"

            def usuario = new Usuario(
                    username: "usuario",
                    password: "root",
                    nome: "Usuario",
                    enabled: true
            )
            usuario.save flush: true

            UsuarioPapel.create usuario, Papel.findByAuthority("ROLE_SLSMN"), true

            println "Populando usuario comum - OK"
        }

    }

    def destroy = {
    }
}
