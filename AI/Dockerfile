FROM python:3.9.16
WORKDIR /usr/app
COPY . .




RUN apt-get update && apt-get install -y \
    protobuf-compiler \
    && rm -rf /var/lib/apt/lists/*
# 가상환경을 활성화합니다.
RUN git clone https://github.com/tensorflow/models.git && \
    cd models/research && \
    protoc object_detection/protos/*.proto --python_out=. && \
    cp object_detection/packages/tf2/setup.py . && \
    python -m pip install --no-cache-dir . && \
    pip install flask && \
    pip uninstall -y opencv-python && \
    pip install opencv-python && \
    pip install flask-cors && \
    pip install pymysql && \
    apt-get update && \
    apt-get install -y libgl1 && \
    pwd && \
    ls
    

EXPOSE 8083

# 컨테이너 실행시 실행될 명령어 설정
CMD [ "python", "main.py" ]
