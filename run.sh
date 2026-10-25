#chmod +x run.sh
# ./run_all.sh

echo "Starting AI recommendation Service on port 4001..."
cd ai_recommendations_service
mvn spring-boot:run &
AI_RECOMMENDATIONS_SERVICE_PID = $!
cd..

echo "Starting External Data Transfer Service on port 4002..."
cd external_data_transfer_service
mvn spring-boot:run &
EXTERNAL_DATA_TRANSFER_SERVICE = $!
cd..

echo "Starting Farm Alerts Service on port 4003..."
cd farm_alerts_service
mvn spring-boot:run &
FARM_ALERTS_SERVICE_PID = $!
cd..

echo "Starting Farm Updates Service on port 4004..."
cd farm_updates_service
mvn spring-boot:run &
FARM_UPDATES_SERVICE_PID = $!
cd..

echo "Starting Log-In Service on port 4005..."
cd log_in_service
mvn spring-boot:run &
LOG_IN_SERVICE_PID = $!
cd..

echo "Starting Profile Management Service on port 4006..."
cd profile_management_service
mvn spring-boot:run &
PROFILE_MANAGEMENT_SERVICE_PID = $!
cd..

echo "Starting Record Keeping service on port 4007..."
cd record_keeping_service
mvn spring-boot:run &
RECORD_KEEPING_SERVICE_PID = $!
cd..

sleep 5

wait