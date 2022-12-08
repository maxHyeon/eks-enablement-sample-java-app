aws ecr get-login-password --region ap-northeast-2 | docker login --username AWS --password-stdin 151430540785.dkr.ecr.ap-northeast-2.amazonaws.com
docker tag eks-cicd-workshop:latest 151430540785.dkr.ecr.ap-northeast-2.amazonaws.com/eks-cicd-workshop:x-86
docker push 151430540785.dkr.ecr.ap-northeast-2.amazonaws.com/eks-cicd-workshop:x-86