package com.gmalheiro.spring.boot.test.car;

public class Driver {
        private Corolla corolla;

        public Driver (Corolla corolla) {
            this.corolla = corolla;
        }

        public void drive () {
                corolla.accelerate();
                corolla.stop();
                corolla.honk();
        }
}
