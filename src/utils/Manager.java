package utils;

import entity.ClotheEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Manager {
    private EntityManager em;

    public Manager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaEE-Clothes");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public static Manager init() {
        return new Manager();
    }

    public ClotheEntity createTestClothe() {
        ClotheEntity clotheEntity = new ClotheEntity();
        clotheEntity.setDescription("Thorben");
        clotheEntity.setPrice(10.2);
        clotheEntity.setSellerCode("FMA");
        clotheEntity.setSize("Medium");
        em.persist(clotheEntity);

        return clotheEntity;
    }

    public void flush() {
        em.getTransaction().commit();
    }
}
