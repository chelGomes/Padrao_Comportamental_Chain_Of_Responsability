public class SolicitarEmprestimo {
    private TipoEmprestimo tipoEmprestimo;

    public SolicitarEmprestimo(TipoEmprestimo tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public TipoEmprestimo getTipoEmprestimo(){
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo(TipoEmprestimo tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }
}
