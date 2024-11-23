import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import io.github.cdimascio.dotenv.Dotenv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DBConnectionTest {
    // Statická inicializace dotenv pro načítání environmentálních proměnných
    private static final Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        // Načtení připojovacího řetězce z .env souboru
        try (MongoClient mongoClient = MongoClients.create(getDatabaseUri())) {
            MongoDatabase database = mongoClient.getDatabase("record");
            MongoCollection<Document> collection = database.getCollection("record");

            Document result = collection.find().first();

            if (result != null) {
                System.out.println(result.toJson());
            } else {
                System.out.println("No document found.");
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Statická metoda pro získání URI z .env souboru
    public static String getDatabaseUri() {
        return dotenv.get("DB_URI");
    }
}
