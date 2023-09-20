package domain;


    public class Tribunal {
        private int codigo;
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        private String nome;
    
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Tribunal(int codigo, String nome) {
            this.codigo = codigo;
            this.nome = nome;
        }
    
        @Override
        public String toString() {
            return "Tribunal [codigo=" + codigo + ", nome=" + nome + "]";
        }
        
    }
    

