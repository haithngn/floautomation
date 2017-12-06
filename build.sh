project=$1
output=$2
xcodebuild -project $project -scheme "Flo" -configuration Debug clean build CONFIGURATION_BUILD_DIR=$output
