## This project provides a simple demonstration of using Kafka for event-driven message passing.

1. The Cab Driver module sends its location data every second via a Kafka topic.
2. The Cab User module listens to that topic and shows the driver's updated location every second.
