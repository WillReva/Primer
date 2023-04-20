import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class WordCount {
    public static void main(String[] args) {
        // create Spark session
        SparkSession spark = SparkSession.builder()
                .appName("WordCount")
                .master("local")
                .getOrCreate();
        System.out.println("Hello Spark");
        // read input data
        /*Dataset<String> lines = spark.read().textFile("input.txt");

        // split the lines into words
        Dataset<String> words = lines.flatMap(line -> Arrays.asList(line.split(" ")).iterator(),
                Encoders.STRING());

        // count the occurrences of each word
        Dataset<Row> wordCounts = words.groupBy("value").count().sort(desc("count"));

        // show the results
        wordCounts.show();

        // save the results to a text file
        wordCounts.write().text("output");*/

        // stop the Spark session
        spark.stop();
    }
}
