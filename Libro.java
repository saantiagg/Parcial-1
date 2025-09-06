public class Libro {
    private String titulo;
    private string autor;
    private int cantidadDisponible;
    private int cantidadPrestados; 

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.cantidadDisponible = 0;
        this.cantidadPrestados = 0;

        public String getTitulo() { return titulo;} 
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }

        public int getCantidadDisponible() { return cantidadDisponible; }
        public void setCantidadDisponible (int cantidadDispoinible) { this.cantidadDisponible = cantidadDisponible; }

        public int getCantidadPrestados() { return cantidadPrestados; }
        
        public void setCatidadPrestados(int cantidadPrestados) { this.cantidadPrestados = cantidadPrestados; }

        public boolean prestar() {
            if (cantidadPrestados < cantidadDisponible) {
                cantidadPrestados++;
                return true;
            } else {
                return false;
            }

            public boolean devolver() {
                if (cantidadPrestados > 0) {
                    cantidadPrestados--;
                    return true;
                } else {
                    return false;
                }

                @Override 

                public String toString() {
                    return "Libro{" +
                            "titulo='" + titulo + '\'' +
                            ", autor='" + autor + '\'' +
                            ", cantidadDisponible=" + cantidadDisponible +
                            ", cantidadPrestados=" + cantidadPrestados +
                            '}';
                }
        }


    }

    
}
