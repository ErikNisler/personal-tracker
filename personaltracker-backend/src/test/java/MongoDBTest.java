import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import io.github.cdimascio.dotenv.Dotenv;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest {
    public static void main(String[] args) {
        // Replace the placeholder with your MongoDB deployment's connection string
        private static final Dotenv dotenv = Dotenv.load();
        String uri = "mongodb+srv://tomator5000:3C9aHZ5GQAFOYBVa@cluster0.jpsbr.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(getDatabaseUri())) {
            MongoDatabase database = mongoClient.getDatabase("record");
            MongoCollection<Document> collection = database.getCollection("record");

            Document query = new Document("name", "Stock");
            Document result = collection.find(query).first();

            if (result != null) {
                System.out.println(result.toJson());
            } else {
                System.out.println("No document found.");
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static String getDatabaseUri() {
        return dotenv.get("DB_URI");
    }
}
