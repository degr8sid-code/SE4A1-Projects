FROM node:16

WORKDIR /app

COPY ./ /app

CMD ["node","app.js"]
