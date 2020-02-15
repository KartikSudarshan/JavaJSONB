# Build
mvn clean package && docker build -t com.mycompany/JsonbWeb .

# RUN

docker rm -f JsonbWeb || true && docker run -d -p 8080:8080 -p 4848:4848 --name JsonbWeb com.mycompany/JsonbWeb 