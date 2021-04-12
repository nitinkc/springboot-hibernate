For making full use of the free tier, The Database and it's corrosponding instance need to be up and running only while development and testing.
Always delete the instance after the experimentation is done

```shell
### Delete Instance
gcloud spanner instances delete development-nc
```

The following commands can be run.

```shell
# First find the availabe instances
cloud spanner instance-configs list

# Costs 90 cents an hours
gcloud spanner instances create development-nc --config=regional-us-central1 \
--description="Spanner DB Instance" --nodes=1

gcloud spanner databases create spanner-db --instance=development-nc
```

If needed :

```shell
### Update instance
gcloud spanner instances update [INSTANCE-ID] --description=[INSTANCE-NAME]

### Update the number of nodes
gcloud spanner instances update [INSTANCE-ID] --nodes=[NODE-COUNT]
```

gcloud spanner databases ddl update orders \
--instance=development-nc \
--ddl="$(schema.ddl)"
