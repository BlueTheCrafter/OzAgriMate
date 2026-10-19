#chmod +x run.sh
echo "Starting OzAgriMate..."
(
  cd ozagrimate
  ./mvnw spring-boot:run
) &

wait