#!/bin/bash

#-n: Number of requests
#-c: Number of concurrent requests
#-H: Add header
#—r: flag to not exit on socket receive errors
#-k: Use HTTP KeepAlive feature
#-p: File containing data to POST
#-T: Content-type header to use for POST/PUT data,

#ab -n 10 -c 1 -p post.txt -T application/json http://192.168.1.235:7070/digitalTwin/zdt00001/start

ab -n 10 -c 1 -p post.txt -T application/json http://192.168.1.89:7070/digitalTwin/zdt00001/start