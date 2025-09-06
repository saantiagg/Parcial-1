public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDisponible;
    private int cantidadPrestados; 

    public Libro(String titulo, String autor, int cantidadDisponible, int cantidadPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadPrestados = cantidadPrestados;

    }

    
    

        public String getTitulo() { return titulo;} 
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }

        public int getCantidadDisponible() { return cantidadDisponible; }
        public void setCantidadDisponible (int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }

        public int getCantidadPrestados() { return cantidadPrestados; }
        
        public void setCatidadPrestados(int cantidadPrestados) { this.cantidadPrestados = cantidadPrestados; }

        public boolean prestar() {
            if (cantidadDisponible > 0) {
                this.cantidadDisponible--;
                this.cantidadPrestados++;
                return true;
            } 
            return false;
        }

            
         public boolean devolver() {
                if (cantidadPrestados > 0) {
                    this.cantidadPrestados--;
                    this.cantidadDisponible++;
                    return true;
                } 
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




    

