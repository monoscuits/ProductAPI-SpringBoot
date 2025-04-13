package com.kishore.monoscuits;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.kishore.monoscuits.repository.productRepository;
import com.kishore.monoscuits.models.Products;


@Component
public class dataSeeder implements CommandLineRunner {

    @Autowired
    private productRepository productRepository;

    @Override
    public void run(String...args) throws Exception{

        if(productRepository.count() == 0){
            List<Products> productList = Arrays.asList(
                    new Products(50, "Wireless headphones with noise cancellation", "Electronics", 120, 4.3, 99.99, "Headphones",
                            Arrays.asList("https://picsum.photos/seed/headphones1/200", "https://picsum.photos/seed/headphones2/200")),

                    new Products(30, "Organic green tea pack for healthy living", "Grocery", 80, 4.7, 10.49, "Green Tea",
                            Arrays.asList("https://picsum.photos/seed/greentea1/200", "https://picsum.photos/seed/greentea2/200")),

                    new Products(20, "Keeps your water cold all day long", "Kitchen", 60, 4.4, 18.99, "Water Bottle",
                            Arrays.asList("https://picsum.photos/seed/waterbottle1/200", "https://picsum.photos/seed/waterbottle2/200")),

                    new Products(40, "Comfortable office chair with lumbar support", "Furniture", 100, 4.2, 89.99, "Office Chair",
                            Arrays.asList("https://picsum.photos/seed/chair1/200", "https://picsum.photos/seed/chair2/200")),

                    new Products(15, "1TB SSD drive for ultra-fast performance", "Electronics", 200, 4.8, 129.00, "SSD Drive",
                            Arrays.asList("https://picsum.photos/seed/ssd1/200", "https://picsum.photos/seed/ssd2/200")),

                    new Products(55, "Elegant vase to beautify your home", "Decor", 35, 4.0, 19.99, "Vase",
                            Arrays.asList("https://picsum.photos/seed/vase1/200", "https://picsum.photos/seed/vase2/200")),

                    new Products(10, "Rugged mountain bike for rough terrain", "Sports", 45, 4.6, 399.99, "Mountain Bike",
                            Arrays.asList("https://picsum.photos/seed/bike1/200", "https://picsum.photos/seed/bike2/200")),

                    new Products(100, "Smooth gel pens for note-taking", "Stationery", 75, 4.3, 4.99, "Gel Pens",
                            Arrays.asList("https://picsum.photos/seed/pens1/200", "https://picsum.photos/seed/pens2/200")),

                    new Products(25, "Durable shoes for hiking and adventures", "Fashion", 90, 4.4, 79.99, "Hiking Shoes",
                            Arrays.asList("https://picsum.photos/seed/shoes1/200", "https://picsum.photos/seed/shoes2/200")),

                    new Products(60, "Face wash specially made for oily skin", "Beauty", 70, 4.5, 12.89, "Face Wash",
                            Arrays.asList("https://picsum.photos/seed/facewash1/200", "https://picsum.photos/seed/facewash2/200"))
            );

            productRepository.saveAll(productList);
            System.out.println("demo data seeded!");
        }
    }
}
