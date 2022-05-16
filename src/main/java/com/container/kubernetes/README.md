##Kubernetes::
- Node
    - Kubelet
    - Communication with master
    - runs pods
- Pod
    - Runs 1+Container
    - Exists on a node
- Service
    - Handles request
    - Usally a load balancer
- Deployment
    - Defines desired state - kubernetes handle the rest
      Kubernetes -> deployment.yaml


## Container Cluster ...
- Service discovery
- Fail over und lastenverteilung (neue Knoten werden hochgeladen, wenn benötigt)
- Loadb balancing