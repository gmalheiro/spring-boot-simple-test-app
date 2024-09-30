package com.gmalheiro.spring.boot.test.car;

public class Driver {
        private Car car;

        public Driver (Car car) {
            this.car = car;
        }

        public void drive () {
                car.accelerate();
                car.stop();
                car.honk();
        }
}
