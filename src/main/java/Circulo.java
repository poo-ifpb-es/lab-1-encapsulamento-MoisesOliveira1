
public class Circulo{ 
    
        private float raio;
        double PI = 3.14159;

        public Circulo(float raio) {
            this.raio = raio;
        }

        public float getRaio() {
            return raio;
        }
        
        public void setRaio(float raio) {
            this.raio = raio;
        }

        public float getArea() {
            return (float) (PI * raio * raio)*(2);
        }

        public float getCircunferencia() {
            return (float) (2 * PI * raio);
        }


    }
