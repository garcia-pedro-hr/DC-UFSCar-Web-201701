package usuariopapelmodelo

import br.ufscar.dc.dsw.Usuario
import br.ufscar.dc.dsw.Papel
import br.ufscar.dc.dsw.UsuarioPapel

class BootStrap {

    def init = { servletContext ->
        def adminPapel = Papel.findByAuthority("ROLE_ADMIN") ?:
                new Papel(authority: "ROLE_ADMIN").save()

        def admin = new Usuario(
                username: "admin",
                password: "root",
                nome: "Administrador",
                enabled : true
        )

        admin.save()
        if (admin.hasErrors()) {
            println admin.errors
        }
        UsuarioPapel.create(admin,adminPapel)

        println 'populando usuÃ¡rio admin - ok'
    }
    def destroy = {
    }
}
