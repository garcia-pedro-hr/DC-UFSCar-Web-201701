import br.ufscar.dc.web.UsuarioPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    usuarioPasswordEncoderListener(UsuarioPasswordEncoderListener, ref('hibernateDatastore'))
}
