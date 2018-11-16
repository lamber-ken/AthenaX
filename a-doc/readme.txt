
1. mvn clean package -DskipTests

2. run AthenaXServer

3. post

http://localhost:8089/ws/v1/jobs/bbdc7ea9-aeff-4893-9f0c-1005003
{
	"query": "select 1",
	"outputs": [],
	"desired-state": [{
		"clusterId": "foo",
		"resource": {
			"queue": "root.wuxian.defaultqueue",
			"memory": 1024,
			"vCores": 2,
			"executionSlots": 1
		}
	}],
	"tag": "foo"
}

4. JobCompiler.java


5. hadoop dfs -ls /flink/at/home/.flink/application_1528182205640_2772







