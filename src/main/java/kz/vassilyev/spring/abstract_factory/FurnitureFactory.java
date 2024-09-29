package kz.vassilyev.spring.abstract_factory;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
