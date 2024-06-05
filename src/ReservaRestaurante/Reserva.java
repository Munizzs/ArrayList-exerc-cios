package ReservaRestaurante;
public class Reserva {
    public int NumeroMesa;
    public String NomeResponsavel;
    public int QuantidadePessoas;

    public Reserva(int NumeroMesa, String NomeResponsavel, int QuantidadePessoas) {
        this.NumeroMesa = NumeroMesa;
        this.NomeResponsavel = NomeResponsavel;
        this.QuantidadePessoas = QuantidadePessoas;
    }
}
